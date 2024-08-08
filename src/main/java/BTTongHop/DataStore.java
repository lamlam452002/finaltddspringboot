package BTTongHop;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static List<Lop> dsLop = new ArrayList<>();
    private static List<SinhVien> dsSinhVien = new ArrayList<>();
    private static List<XepLop> dsXepLop = new ArrayList<>();

    public static List<Lop> getDsLop()
    {
        return dsLop;
    }

    public static List<SinhVien> getDsSinhVien()
    {
        return dsSinhVien;
    }

    public static List<XepLop> getDsXepLop()
    {
        return dsXepLop;
    }
}
