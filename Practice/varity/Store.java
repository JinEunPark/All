//package varity;
//
//class Store {
//    FullHDTV fullhdtv;
//    UHDTV uhdtv;
//
//    public Store() {
//        fullhdtv = new FullHDTV(
//                new FullHDProcessor("Mtek1920"));
//        uhdtv = new UHDTV(new UHDProcessor("Mtek3840"));
//        uhdtv.setBroadcastFormat("4K");
//    }
//
//    public void showTV(TV tv) {
//        tv.show();
//    }
//
//    public void showDisplayTVs() {
//        showTV(fullhdtv);
//        showTV(uhdtv);
//    }
//
//    public static void main(String[] args) {
//        Store store = new Store();
//        store.showDisplayTVs();
//    }
//
//}
