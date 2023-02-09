package com.example.repository;

import com.example.bean.Medical;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MedicalRepository implements IMedicalRepository{
    private static List<Medical> medicalList;
    static {
        medicalList = new ArrayList<>();
        medicalList.add(new Medical("Pham Le Dong","17/05/2003","Nam","Việt Nam","206459880","Ô tô","92-N1-12345",4,"1","1","2021","5","1","2021","Không"));
        medicalList.add(new Medical("Pham Le Dong2","17/05/2003","Nữ","Mẽo","206459881","Tàu bay","92-A1-12345",4,"1","2","2021","6","2","2021","Không"));
        medicalList.add(new Medical("Pham Le Dong3","17/05/2003","Nam","Tàu","206459882","Tàu thuyền","92-B1-12345",4,"1","3","2021","7","3","2021","Không"));
        medicalList.add(new Medical("Pham Le Dong4","17/05/2003","Bê đê","Hàn Xẻng","206459883","Xe máy","92-C1-12345",4,"1","4","2021","8","4","2021","Không"));
    }
    @Override
    public List<Medical> findAll() {
        return medicalList;
    }

    @Override
    public void save(Medical medical) {
        medicalList.add(medical);
    }
}
