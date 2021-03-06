package main;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSonTest {

    public static void main(String args[]){

        String filename = "C:\\Users\\sysoper\\Desktop\\test.json";

        List<SingleDayTraining> list = new ArrayList<SingleDayTraining>();
        List<TrainingTest> trainingList = new ArrayList<TrainingTest>();

        list.add(new SingleDayTraining("29.03.2019",20));
        list.add(new SingleDayTraining("24.02.2018",20));
        list.add(new SingleDayTraining("23.01.2019",20));

        trainingList.add(new TrainingTest("Boks", list));
        trainingList.add(new TrainingTest("MMA", list));

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), trainingList);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
