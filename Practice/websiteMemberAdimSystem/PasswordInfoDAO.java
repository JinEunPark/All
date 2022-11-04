package websiteMemberAdimSystem;

import java.util.List;

public interface PasswordInfoDAO {
    public void insert(PasswordInfo p);
    public List<PasswordInfo> findAll();
    public void update(String url, PasswordInfo p);
    public PasswordInfo findByKey(String url);
    public void delete(PasswordInfo p);
    public void delete(String url);
}
