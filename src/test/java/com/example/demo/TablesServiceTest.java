package com.example.demo;

import com.example.demo.entities.Tables;
import com.example.demo.repo.TableRepository;
import com.example.demo.service.TableService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TablesServiceTest {

    @InjectMocks
    private TableService tableService;

    @Mock
    private TableRepository tableRepository;

    @Test
    public void getAllTablesTest(){
        List<Tables> expect = new ArrayList<>();
        expect.add(new Tables(1l,"5","1",null));

        List<Tables> actual = new ArrayList<>();
        actual.add(new Tables(1l,"5","1",null));
        Mockito.when(tableRepository.findAll()).thenReturn(actual);
        Assert.assertEquals(expect,actual);
    }
}
