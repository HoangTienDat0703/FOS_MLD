package com.example.demo.service;

import com.example.demo.entities.QRCode;
import com.example.demo.entities.Tables;
import com.example.demo.implementService.ITablesService;
import com.example.demo.repo.QRCodeRepository;
import com.example.demo.repo.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService implements ITablesService {
    @Autowired
    private TableRepository tableRepository;

    @Autowired
    private QRCodeRepository qrCodeRepository;

    @Override
    public Tables addTable(Tables table) {
        return tableRepository.save(table);
    }

    @Override
    public Tables updateTable(Tables table) {
        QRCode qrCode = qrCodeRepository.findByQRCodeId(table.getQrCode().getQRCodeId());
        if(table != null){
            Tables table1 = tableRepository.getById(table.getTableId());
            if (table1 != null){
                table1.setNumberOfSeats(table.getNumberOfSeats());
                table1.setStatus(table.getStatus());
                table1.setQrCode(qrCode);

                return tableRepository.save(table1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteTable(Long id) {
        Tables table = tableRepository.getById(id);
        if(table != null){
            tableRepository.delete(table);
            return true;
        }
        return false;
    }

    @Override
    public List<Tables> getAllTables() {
        return tableRepository.findAll();
    }
}
