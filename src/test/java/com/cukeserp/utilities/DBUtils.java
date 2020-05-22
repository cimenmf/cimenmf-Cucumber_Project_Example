package com.cukeserp.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;


    public static void setQuery(String query) {
        try {
            connection = DriverManager.getConnection(ConfigurationReader.getProperties("briteURL"), ConfigurationReader.getProperties("britUSER5"),
                    ConfigurationReader.getProperties("britPASS5"));
        } catch (SQLException e) {
            throw new RuntimeException("SQL- connection exception");
        }
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            throw new RuntimeException("SQL- statement exception");
        }
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            new RuntimeException("SQL- query exception");
        }
    }

    public static List<Map<String, Object>> getDataList() {
        try {
            List<Map<String, Object>> list = new ArrayList<>();
            ResultSetMetaData rsMData = resultSet.getMetaData();
            int colCount = rsMData.getColumnCount();


            while (resultSet.next()) {
                Map<String, Object> rowMap = new HashMap<>();
                for (int i = 1; i <= colCount; i++) {
                    rowMap.put(rsMData.getColumnName(i), resultSet.getObject(i));
                }
                list.add(rowMap);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException("SQL getDataList exception");
        }

    }

    public static List<Map<String, Object>> getDataList(String query) {
        setQuery(query);
        try {
            List<Map<String, Object>> list = new ArrayList<>();
            ResultSetMetaData rsMData = resultSet.getMetaData();
            int colCount = rsMData.getColumnCount();

            while (resultSet.next()) {
                Map<String, Object> rowMap = new HashMap<>();
                for (int i = 1; i <= colCount; i++) {
                    rowMap.put(rsMData.getColumnName(i), resultSet.getObject(i));
                }
                list.add(rowMap);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException("SQL getDataList exception");
        }

    }


    public static String getStringData(String query) {
        setQuery(query);
        String data = "";
        try {
            resultSet.next();
            data = resultSet.getString(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

//    public static void createConnection() {
//        String url = "jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/room_reservation_qa";
//        String user = "qa_user";
//        String password = "Cybertek11!";
//
//        try {
//            connection = DriverManager.getConnection(url, user, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void executeQuery(String query) {
//        try {
//            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        try {
//            resultSet = statement.executeQuery(query);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public static void closeConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param query
     * @return returns a single cell value. If the results in multiple rows and/or
     * columns of data, only first column of the first row will be returned.
     * The rest of the data will be ignored
     */
    public static Object getCellValue(String query) {
        return getQueryResultList(query).get(0).get(0);
    }

    /**
     * @param query
     * @return returns a list of Strings which represent a row of data. If the query
     * results in multiple rows and/or columns of data, only first row will
     * be returned. The rest of the data will be ignored
     */
    public static List<Object> getRowList(String query) {
        return getQueryResultList(query).get(0);
    }

    /**
     * @param query
     * @return returns a map which represent a row of data where key is the column
     * name. If the query results in multiple rows and/or columns of data,
     * only first row will be returned. The rest of the data will be ignored
     */
    public static Map<String, Object> getRowMap(String query) {

        return getQueryResultMap(query).get(0);
    }

    /**
     * @param query
     * @return returns query result in a list of lists where outer list represents
     * collection of rows and inner lists represent a single row
     */
    public static List<List<Object>> getQueryResultList(String query) {
        setQuery(query);
        List<List<Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;

        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                List<Object> row = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    row.add(resultSet.getObject(i));
                }

                rowList.add(row);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rowList;

    }

    /**
     * @param query
     * @param column
     * @return list of values of a single column from the result set
     */
    public static List<Object> getColumnData(String query, String column) {
        setQuery(query);
        List<Object> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;

        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                rowList.add(resultSet.getObject(column));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return rowList;

    }

    /**
     * @param query
     * @return returns query result in a list of maps where the list represents
     * collection of rows and a map represents represent a single row with
     * key being the column name
     */
    public static List<Map<String, Object>> getQueryResultMap(String query) {
        setQuery(query);
        List<Map<String, Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                Map<String, Object> colNameValueMap = new HashMap<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    colNameValueMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
                }
                rowList.add(colNameValueMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowList;
    }

    /**
     * @param query
     * @return List of columns returned in result set
     */
    public static List<String> getColumnNames(String query) {
        setQuery(query);
        List<String> columns = new ArrayList<>();
        ResultSetMetaData rsmd;

        try {
            rsmd = resultSet.getMetaData();
            int columnCount = rsmd.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                columns.add(rsmd.getColumnName(i));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return columns;

    }


    public static int getRowCount() {
        int rowCount = 0;
        try {
            resultSet.last();

            rowCount = resultSet.getRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowCount;

    }

    public static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("SQL- close exception");
        }
    }

    // 2019-03-20 03:18:35
    public String dateFormat(String date) {
        String newDate = "";
        String temp = "";


        if (date.length() == 10) {
            newDate = newDate + date.substring(5, 7) + "/" + date.substring(8, 10) + "/" + date.substring(0, 4);
        } else if (date.length() > 10) {
            if (Integer.parseInt(date.substring(11, 13)) >= 0 && Integer.parseInt(date.substring(11, 13)) <= 3) {
                int day = Integer.parseInt(date.substring(8, 10)) - 1;
                int hour = Integer.parseInt(date.substring(11, 13)) + 19;
                newDate = newDate + date.substring(5, 7) + "/" + day + "/" + date.substring(0, 4) + " " + hour + date.substring(13, 19);
            } else {
                newDate = newDate + date.substring(5, 7) + "/" + date.substring(8, 10) + "/" + date.substring(0, 4) + " " + number(date.substring(11, 13)) + date.substring(13, 19);
            }
        }
        return newDate;

    }

    public String number(String str) {
        String newNumber = "";

        int number = Integer.parseInt(str) - 4;
        if (number < 10) {
            newNumber = newNumber + "0" + number;
        } else if(number == 10){
            newNumber = newNumber + number;
        } else {
            newNumber = newNumber + (number-1);
        }
        return newNumber;
    }

    public String extraZero(String str) {
        str = str + "0";
        return str;

    }

    public String getHoursDuration(String name) {
        name = name.replace(".", ":");
        String str = "";
        if (name.length() == 1) {
            str = str + "0" + name + ":00";
        } else if (name.length() == 3) {
            str = str + "0" + name + "0";
        } else if (name.length() == 4) {
            if (name.substring(0, 1).equals("0")) {
                str = str + name + "0";
            } else {
                str = str + "0" + name;
            }
        } else if (name.length() > 4) {
            str = str + name;
        }

        return str;
    }

    public String getPrivacyCorrector(String name) {
        String str = "";
        switch (name) {
            case "private":
                str = str + "Only internal users";
                break;
            case "confidential":
                str = str + "Only internal users";
                break;
            case "public":
                str = str + "Everyone";
                break;
        }

        return str;
    }

    public String getPersentagedNumber(String strNum){
        String str = "";
        int num = Integer.parseInt(strNum.substring(3,5));
        if(strNum.substring(3,5).equals("00")){
            str = str + strNum;
        }else {
            str = str + strNum.substring(0,3) + Math.round(num / 1.666666666666667);
        }


        return str;
    }


}
