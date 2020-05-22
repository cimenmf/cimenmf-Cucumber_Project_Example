package com.cukeserp.step_definitions;

import com.cukeserp.utilities.*;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.*;

public class ContactsAndProductsSteps extends BrowserUtils{

    Pages pages = new Pages();

    ExcelUtil dataContacts = new ExcelUtil(PATH_INFORMATION, SHEET_CONTACTS);
    List<Map<String, String>> listContacts = dataContacts.getDataList();

    ExcelUtil dataProducts = new ExcelUtil(PATH_INFORMATION, SHEET_PRODUCTS);
    List<Map<String, String>> listProducts = dataProducts.getDataList();

    @Then("{string} enters {string} in {string} field")
    public void types_in_field(String userName, String information, String fieldName) {

        switch (fieldName) {
        case "Name":
            pages.getContactPage().fullName.sendKeys(information);
            break;
        case "Company":
            pages.getContactPage().company.sendKeys(information + Keys.ENTER);
            break;
        case "Street":
            pages.getContactPage().street.sendKeys(information);
            break;
        case "City":
            pages.getContactPage().city.sendKeys(information);
            break;
        case "State":
            pages.getContactPage().state.sendKeys(information + Keys.ENTER);
            break;
        case "Zip Code":
            pages.getContactPage().zip.sendKeys(information);
            break;
        case "Country":
            pages.getContactPage().country.sendKeys(information);
            break;
        case "Job Position":
            pages.getContactPage().jobPosition.sendKeys(information);
            break;
        case "Phone":
            pages.getContactPage().phone.sendKeys(information);
            break;
        case "Email":
            pages.getContactPage().email.sendKeys(information);
            break;
        case "Website":
            pages.getContactPage().website.sendKeys(information);
            break;
        case "Product name": 
            pages.getContactPage().fullName.sendKeys(information);
            break;
        case "Internal Reference":
            pages.getInventoryPage().internalReference.sendKeys(information);
            break;
        case "Sales Price":
            pages.getInventoryPage().salesPrice.click();
            pages.getInventoryPage().salesPrice.clear();
            pages.getInventoryPage().salesPrice.sendKeys(information);
            break;
        case "Cost":
            pages.getInventoryPage().cost.click();
            pages.getInventoryPage().cost.clear();
            pages.getInventoryPage().cost.sendKeys(information);
            break;
    }}

    @Then("{string} should see {string} in {string} field")
    public void should_be_able_to_seeCheckbox_in(String userName, String information, String fieldName) {

        switch (fieldName) {
            case "Name":
                Assert.assertEquals(pages.getContactPage().contactFullName.getText(), information);
                break;
            case "Street":
                Assert.assertEquals(pages.getContactPage().contactStreet.getText(), information);
                break;
            case "City":
                Assert.assertEquals(pages.getContactPage().contactCity.getText(), information);
                break;
            case "Zip Code":
                Assert.assertEquals(pages.getContactPage().contactZip.getText(), information);
                break;
            case "Job Position":
                Assert.assertEquals(pages.getContactPage().contactJobPosition.getText(), information);
                break;
            case "Phone":
                Assert.assertEquals(pages.getContactPage().contactPhone.getText(), information);
                break;
            case "Email":
                Assert.assertEquals(pages.getContactPage().contactEmail.getText(), information);
                break;
            case "Website":
                Assert.assertEquals(pages.getContactPage().contactWebsite.getText(), information);
                break;
            case "Product name":
                Assert.assertEquals(pages.getContactPage().contactFullName.getText(), information);
                break;
            case "Internal Reference":
                Assert.assertEquals(pages.getInventoryPage().productInternalReference.getText(), information);
                break;
            case "Sales Price":
                Assert.assertTrue(pages.getInventoryPage().productSalesPrice.getText().contains(information));
                break;
            case "Cost":
                Assert.assertTrue(pages.getInventoryPage().productCost.getText().contains(information));
                break;
        }

    }

    @Then("{string} should see {string} in {string} Database")
    public void should_be_able_to_see_in_Database(String userName, String information, String DBname) {

        switch (DBname) {
            case "name":
                List<Object> name = new ArrayList<>(getColumnData(CONTACTS_QUERY, "name"));
                Assert.assertTrue(name.toString().contains(information));
                break;
            case "street":
                List<Object> street = new ArrayList<>(getColumnData(CONTACTS_QUERY, "street"));
                Assert.assertTrue(street.toString().contains(information));
                break;
            case "city":
                List<Object> city = new ArrayList<>(getColumnData(CONTACTS_QUERY, "city"));
                Assert.assertTrue(city.toString().contains(information));
                break;
            case "zip":
                List<Object> zip = new ArrayList<>(getColumnData(CONTACTS_QUERY, "zip"));
                Assert.assertTrue(zip.toString().contains(information));
                break;
            case "function":
                List<Object> function = new ArrayList<>(getColumnData(CONTACTS_QUERY, "function"));
                Assert.assertTrue(function.toString().contains(information));
                break;
            case "phone":
                List<Object> phone = new ArrayList<>(getColumnData(CONTACTS_QUERY, "phone"));
                Assert.assertTrue(phone.toString().contains(information));
                break;
            case "email":
                List<Object> email = new ArrayList<>(getColumnData(CONTACTS_QUERY, "email"));
                Assert.assertTrue(email.toString().contains(information));
                break;
            case "website":
                List<Object> website = new ArrayList<>(getColumnData(CONTACTS_QUERY, "website"));
                Assert.assertTrue(website.toString().contains(information));
                break;
            case "product_name":
                List<Object> productName = new ArrayList<>(getColumnData(PRODUCT_QUERY,"product_name"));
                Assert.assertTrue(productName.toString().contains(information));
                break;
            case "default_code":
                List<Object> defaultCode = new ArrayList<>(getColumnData(PRODUCT_QUERY,"default_code"));
                Assert.assertTrue(defaultCode.toString().contains(information));
                break;
            case "barcode":
                List<Object> barcode = new ArrayList<>(getColumnData(PRODUCT_QUERY,"barcode"));
                Assert.assertTrue(barcode.toString().contains(information));
                break;
            case "list_price":
                List<Object> listPrice = new ArrayList<>(getColumnData(PRODUCT_QUERY,"list_price"));
                Assert.assertTrue(listPrice.toString().contains(information));
                break;
            case "cost":
                List<Object> cost = new ArrayList<>(getColumnData(PRODUCT_QUERY,"cost"));
                Assert.assertTrue(cost.toString().contains(information));
                break;
        }
    }

    @Then("{string} takes information from excel {string}, {string} sheet, row of {int}")
    public void takes_information_from_excel_and_sheet_index_of(String userName, String excelName, String sheetName, Integer row) {

        if(excelName.equals("Information") && sheetName.equals("Contacts")){

        pages.getContactPage().fullName.sendKeys(listContacts.get(row).get("Name"));
        pages.getContactPage().company.sendKeys(listContacts.get(row).get("Company")+ Keys.ENTER);
        pages.getContactPage().street.sendKeys(listContacts.get(row).get("Street"));
        pages.getContactPage().city.sendKeys(listContacts.get(row).get("City"));
        pages.getContactPage().state.sendKeys(listContacts.get(row).get("State")+ Keys.ENTER);
        pages.getContactPage().zip.sendKeys(listContacts.get(row).get("Zip Code"));
        pages.getContactPage().country.sendKeys(listContacts.get(row).get("Country"));
        pages.getContactPage().jobPosition.sendKeys(listContacts.get(row).get("Job Position"));
        pages.getContactPage().phone.sendKeys(listContacts.get(row).get("Phone"));
        pages.getContactPage().email.sendKeys(listContacts.get(row).get("Email"));
        pages.getContactPage().website.sendKeys(listContacts.get(row).get("Website"));

    }
    }

    @Then("{string} should see correct information from excel {string}, {string} sheet, row of {int}")
    public void should_see_correct_information_from_excel_sheet_row_of(String userName, String excelName, String sheetName, Integer row) {

        if(excelName.equals("Information") && sheetName.equals("Contacts")){

        Assert.assertEquals(listContacts.get(row).get("Name"), pages.getContactPage().contactFullName.getText());
        Assert.assertEquals(listContacts.get(row).get("Street"), pages.getContactPage().contactStreet.getText());
        Assert.assertEquals(listContacts.get(row).get("City"), pages.getContactPage().contactCity.getText());
        Assert.assertEquals(listContacts.get(row).get("Zip Code"), pages.getContactPage().contactZip.getText());
        Assert.assertEquals(listContacts.get(row).get("Job Position"), pages.getContactPage().contactJobPosition.getText());
        Assert.assertEquals(listContacts.get(row).get("Phone"), pages.getContactPage().contactPhone.getText());
        Assert.assertEquals(listContacts.get(row).get("Email"), pages.getContactPage().contactEmail.getText());
        Assert.assertEquals(listContacts.get(row).get("Website"), pages.getContactPage().contactWebsite.getText());

    }}

    @Then("{string} enters information from excel {string}, {string} sheet and should see correct information")
    public void takes_information_from_excel_sheet(String userName, String excelName, String sheetName) {

        if(excelName.equals("Information") && sheetName.equals("Products")){

        for (int i = 0; i < dataProducts.rowCount()-2; i++){

           pages.getContactPage().fullName.sendKeys(listProducts.get(i).get("Product name"));
           pages.getInventoryPage().internalReference.sendKeys(listProducts.get(i).get("Internal Reference"));
           WebElement salesPrice = pages.getInventoryPage().salesPrice;
           salesPrice.click();
           salesPrice.clear();
           pages.getInventoryPage().salesPrice.sendKeys(listProducts.get(i).get("Sales Price"));
           WebElement cost = pages.getInventoryPage().cost;
           cost.click();
           cost.clear();
           pages.getInventoryPage().cost.sendKeys(listProducts.get(i).get("Cost"));

           pages.getUniversalPage().save_button.click();

           Assert.assertEquals(pages.getContactPage().contactFullName.getText(),listProducts.get(i).get("Product name"));
           Assert.assertEquals(pages.getInventoryPage().productInternalReference.getText(),listProducts.get(i).get("Internal Reference"));
           Assert.assertTrue(pages.getInventoryPage().productSalesPrice.getText().contains(listProducts.get(i).get("Sales Price")));
           Assert.assertTrue(pages.getInventoryPage().productCost.getText().contains(listProducts.get(i).get("Cost")));

            if (i != dataProducts.rowCount() - 2) {
                waitForClickablility(pages.getUniversalPage().create_button, 10);
                pages.getUniversalPage().create_button.click();
            }
        }
    }}






    public static void main(String[] args) {
        ExcelUtil dataContacts = new ExcelUtil(PATH_INFORMATION, SHEET_CONTACTS);
        List<Map<String, String>> listContacts = dataContacts.getDataList();

        for (int i = 0; i < listContacts.size(); i++) {
            System.out.println(i + " " + listContacts.get(i));
        }

        System.out.println(listContacts.get(0).get("Zip Code"));


        ExcelUtil dataProducts = new ExcelUtil(PATH_INFORMATION, SHEET_PRODUCTS);
        List<Map<String, String>> listProducts = dataProducts.getDataList();
        Pages pages = new Pages();

        for (int i = 0; i < dataProducts.rowCount()-2; i++){
            System.out.println(i + " " + listProducts.get(i).get("Product name"));
        }

    }
}








