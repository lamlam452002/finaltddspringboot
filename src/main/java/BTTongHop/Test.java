package BTTongHop;

import java.sql.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        LopManager.getInstance().Add(Lop.builder().MaLop("CNTT").TenLop("Advanced Java").PhuTrach("Nguyen Tung").build());
        SinhvienManager.getInstance().AddSinhVien(SinhVien.builder().MaSV("SV01").build());
        XepLop xl1 = XepLop.builder().MaLop("CNTT").MaSV("SV01").NgayVao(Date.valueOf("2024-08-08")).build();

        XepLopManager.getInstance().AddXepLop(xl1);
    }
}
