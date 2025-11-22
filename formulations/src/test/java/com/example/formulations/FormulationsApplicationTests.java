package com.example.formulations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.formulations.utilities.*;

import com.example.formulations.repository.*;

@SpringBootTest
class FormulationsApplicationTests {

    @Autowired
    PopulateTables populateTables;

	@Test
	void contextLoads() {

        populateTables.PopulateAll();

	}





}
