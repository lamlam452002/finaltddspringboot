package BTTongHop;

import java.util.List;
import java.util.stream.Collectors;

public class LopManager {
    private static LopManager instance;
    public static LopManager getInstance()
    {
        if(instance==null)
            instance = new LopManager();
        return instance;
    }
    public void Add(Lop lop) throws Exception {
        List<Lop> lstCheckExist = DataStore.getDsLop().stream()
                .filter((l) -> l.MaLop == lop.MaLop)
                .collect(Collectors.toList());

        if(lstCheckExist.size()>0) throw new Exception("Ma lop "+ lop.MaLop + "Da bi su dung");
        else
        {
            DataStore.getDsLop().add(lop);
        }
    }

    public Lop getLopByMaLop(String malop)
    {
        List<Lop> lstLop = DataStore.getDsLop().stream()
                .filter((l) -> l.MaLop == malop)
                .collect(Collectors.toList());
        if(lstLop.size()>0) return lstLop.get(0);
        return null;
    }
}
