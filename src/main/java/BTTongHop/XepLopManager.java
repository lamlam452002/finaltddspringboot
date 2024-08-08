package BTTongHop;

import java.util.List;
import java.util.stream.Collectors;

public class XepLopManager {
    private static XepLopManager instance;

    public static XepLopManager getInstance() {
        if (instance == null)
            instance = new XepLopManager();
        return instance;
    }

    public void AddXepLop(XepLop xeplop) throws Exception {
        //1. Check Lop id
        //List<Lop> lstCheckLop = DataStore.getDsLop().stream().filter((l)->l.MaLop==xeplop.MaLop).collect(Collectors.toList());
        boolean checkLop = LopManager.getInstance().getLopByMaLop(xeplop.MaLop) != null;
        //2. Check sv id
        //List<SinhVien> lstCheckSv = DataStore.getDsSinhVien().stream().filter((sv)->sv.MaSV == xeplop.MaSV).collect(Collectors.toList());
        boolean checkSinhVien = SinhvienManager.getInstance().getSinhVienByMaSV(xeplop.MaSV) != null;

        if (checkLop && checkSinhVien)
            DataStore.getDsXepLop().add(xeplop);
        else
            throw new Exception("Thong tin xep lop khong hop le");
    }
}
