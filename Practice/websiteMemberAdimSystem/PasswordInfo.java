package websiteMemberAdimSystem;

public class PasswordInfo {

    String url;
    String id;
    String password;

    PasswordInfo(String url, String id, String password){
        this.url = url;
        this.id = id;
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String toString(){
        return "url: "+this.url+ "   id: "+this.id+"    password: "+password;
    }
}
