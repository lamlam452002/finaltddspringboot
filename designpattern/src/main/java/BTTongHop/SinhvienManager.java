package BTTongHop;

import java.util.List;
import java.util.stream.Collectors;

public class SinhvienManager {
    private static SinhvienManager instance;
    public static SinhvienManager getInstance(){
        if(instance==null)
            instance = new SinhvienManager();
        return instance;
    }

    public void AddSinhVien(SinhVien sinhvien) throws Exception {
        List<SinhVien> lstCheckExist = DataStore.getDsSinhVien().stream()
                .filter((sv)->sv.MaSV.equalsIgnoreCase(sinhvien.MaSV))
                .collect(Collectors.toList());
        if(lstCheckExist.size()>0) throw new Exception("MaSV: "+ sinhvien.MaSV + " khong kha dung");
        else
            DataStore.getDsSinhVien().add(sinhvien);
    }

    public SinhVien getSinhVienByMaSV(String masv)
    {
        List<SinhVien> lstSV = DataStore.getDsSinhVien().stream()
                .filter((l) -> l.MaSV.equalsIgnoreCase(masv))
                .collect(Collectors.toList());
        if(lstSV.size()>0) return lstSV.get(0);
        return null;
    }
}
