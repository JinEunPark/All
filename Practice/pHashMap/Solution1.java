import java.util.*;

class Solution1 {
    public static class Song implements Comparable<Song> {
        int index;
        String genres;
        int plays;

        Song(int index, String genres, int plays) {
            this.index = index;
            this.genres = genres;
            this.plays = plays;
        }

        public String toString() {
            return index + " " + genres + " " + plays;
        }

        public int getIndex() {
            return this.index;
        }

        @Override
        public int compareTo(Song other) {
            if (this.plays > other.plays) {
                return -1;
            } else if (this.plays == other.plays) {
                return Integer.compare(this.index, other.index);
            } else {
                return 1;
            }
        }

        public int getPlays() {
            return plays;
        }
    }

    public static int[] solution(String[] genres, int[] plays) {
        Map<String, ArrayList<Song>> genreMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            Song song = new Song(i, genre, plays[i]);
            genreMap.putIfAbsent(genre, new ArrayList<>());
            genreMap.get(genre).add(song);
        }

        ArrayList<String> genreList = new ArrayList<>(genreMap.keySet());
        Collections.sort(genreList, (g1, g2) -> {
            int totalPlays1 = genreMap.get(g1).stream().mapToInt(Song::getPlays).sum();
            int totalPlays2 = genreMap.get(g2).stream().mapToInt(Song::getPlays).sum();
            return Integer.compare(totalPlays2, totalPlays1);
        });

        ArrayList<Integer> answerList = new ArrayList<>();
        for (String genre : genreList) {
            ArrayList<Song> songs = genreMap.get(genre);
            Collections.sort(songs);

            int count = 0;
            for (Song song : songs) {
                answerList.add(song.getIndex());
                count++;
                if (count >= 2) {
                    break;
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }


}