package model;

import exceptions.NoCountryFound;

import java.io.*;
import java.util.ArrayList;

public class Controler {
    private ArrayList<Country>countries;

    public Controler()  {
        countries=new ArrayList<>();

        readData();
    }
    public void readData(){
        try {
            File file= new File(".\\files\\File.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;
            while((line = bufferedReader.readLine())!= null){
                if()
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void writeData(String data){
        try {
            File file= new File(".\\files\\File.txt");
            FileWriter fileWriter= new FileWriter(file,true);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.flush();
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void insertCountry(Country country) {
        countries.add(country);
        writeData(country.toString());
    }

    public void insertCity(City city) throws NoCountryFound{
        boolean flag=false;
        for(int i=0; i<countries.size(); i++) {
            if(city.getCountryID()==countries.get(i).getId()){
                flag=true;
            }
        }
        if (flag) {
            writeData(city.toString());
        }
        if (false) {
            throw new NoCountryFound();
        }

    }
}
