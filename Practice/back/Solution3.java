package back;

import java.util.*;
import java.util.stream.*;

class Solution33 {
    public static class Course {
        public final String course;
        public final int occurrences;

        public Course(String course, int occurrences) {
            this.course = course;
            this.occurrences = occurrences;
        }
    }

    public void getCourse(char nextMenu, //다음으로 선택될 메뉴
                          Set<String> selectedMenu, //선택된 메뉴
                          List<Set<String>> orderList,//주문의 리스트
                          Map<Integer, List<Course>> courses) {

        int occurrences = (int) orderList.stream()
                .filter(order -> order.containsAll(selectedMenu))
                .count();//현재 선택된 메뉴가 존재하는지를 평가함

        if (occurrences < 2) return;

        int size = selectedMenu.size();
        if (courses.containsKey(size)) {
            List<Course> courseList = courses.get(size);
            Course course = new Course(selectedMenu.stream()
                    .sorted()
                    .collect(Collectors.joining("")),
                    occurrences);

            Course original = courseList.get(0);
            if (original.occurrences < occurrences) {
                courseList.clear();
                courseList.add(course);
            } else if (original.occurrences == occurrences) {
                courseList.add(course);
            }
        }

        if(size >= 10) return;

        for(char charMenu = nextMenu; charMenu <='Z'; charMenu++){

            String menu = String.valueOf(charMenu);
            selectedMenu.add(menu);
            getCourse((char) (charMenu +1),selectedMenu,orderList,courses);
            selectedMenu.remove(menu);
        }
    }

    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        //모든 주문의 메뉴를 집합으로 변경하고 이를 리스트에 저장함.
        List<Set<String>> orderSetList = Arrays.stream(orders)
                .map(String::chars)//int stream 으로 변환 문자열을 글자 하나하나에 해당하는 정수 스트림으로 변환.
                .map(charStream -> charStream//정수가 들어옴
                        .mapToObj(menu -> String.valueOf((char) menu))//정수를 char 로 캐스팅하고 이를 다시 string 으로 변환해서 반환함
                        .collect(Collectors.toSet()))//집합으로 변환해서 반환함
                .collect(Collectors.toList());//집합을 다시 리스트에 받음


        Map<Integer, List<Course>> courses = new HashMap<>();//out of index 를 피하기 위해서 사용함
        for (int length : course) {
            List<Course> courseList = new ArrayList<>();
            courseList.add(new Course("", 0));
            courses.put(length, courseList);
        }
        getCourse('A',new HashSet<>(), orderSetList,courses );


        return courses.values().stream()
                .filter(list -> list.get(0).occurrences >0)
                .flatMap(List::stream)
                .map(c->c.course)
                .sorted()
                .toArray(String[]::new);
    }

    List<List<Integer>> nestedLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
    );

//    List<Integer> flatList = nestedLists.stream() stream flat 에 대해서 사용하는 방법 여러 이중 컬렉션에 대해서 하나의 스트림으로 만들때 조흠..
//            .flatMap(List::stream)
//            .collect(Collectors.toList());
//
//System.out.println(flatList); // 출력: [1, 2, 3, 4, 5, 6, 7, 8, 9]
}