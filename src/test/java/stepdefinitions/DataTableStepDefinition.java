package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableStepDefinition {
    @Given("Aşağıdaki tablo bu metodda parametre olarak kullanılacaktır")
    public void aşağıdakiTabloBuMetoddaParametreOlarakKullanılacaktır(DataTable tablo) {

       List<List<String>> data =  tablo.asLists();

        for (List<String> eachRow:data) {
            for (String cell :eachRow) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
