package com.cukeserp.utilities;

public interface SQLQueries {

    String NOTES_TAG_QUERY = "select name from note_tag order by id desc;";
    String NOTES_MESSAGE_QUERY = "select * from note_note order by id desc;";
    String MAINTENANCE_NAME_QUERY = "SELECT NAME FROM maintenance_request order by id desc;";
    String MAINTENANCE_ALL_QUERY = "SELECT * FROM maintenance_request order by id desc;";

    String MAINTENANCE_REQUEST_DATE_QUERY = "SELECT request_date FROM maintenance_request order by id desc;";
    String MAINTENANCE_TYPE_QUERY = "SELECT maintenance_type FROM maintenance_request order by id desc;";
    String MAINTENANCE_SCHEDULE_DATE_QUERY = "SELECT schedule_date FROM maintenance_request order by id desc;";
    String MAINTENANCE_SCHEDULE_HOURS_QUERY = "SELECT duration FROM maintenance_request order by id desc;";
    String MAINTENANCE_DESCRIPTION_QUERY = "SELECT description FROM maintenance_request order by id desc;";
    String MAINTENANCE_PRIORITY_QUERY = "SELECT priority FROM maintenance_request order by id desc;";

    String CONTACTS_QUERY = "SELECT * FROM res_partner ORDER BY write_date desc;";
    String PRODUCT_QUERY = "SELECT  pt.create_uid, name as product_name, pt.default_code, barcode, list_price, cost " +
            "FROM product_template pt JOIN product_product pp " +
            "ON pt.create_uid=pp.create_uid " +
            "JOIN product_price_history pph " +
            "ON pt.create_date=pph.create_date " +
            "order by pp.write_date desc limit 30;";

    String TIMESHEETS_DATE_QUERY = "SELECT date FROM account_analytic_line order by id desc;";
    String TIMESHEETS_DECSRIPTION_QUERY = "SELECT name FROM account_analytic_line order by id desc;";
    String TIMESHEETS_AMOUNT_QUERY = "SELECT unit_amount FROM account_analytic_line order by id desc;";

    String MEETING_NAME_QUERY = "select name from calendar_event order by id desc;";
    String MEETING_STARTING_AT_QUERY = "select start_datetime from calendar_event order by id desc;";
    String MEETING_DURATION_QUERY = "select duration from calendar_event order by id desc;";

    String MEETING_LOCATION_QUERY = "select location from calendar_event order by id desc;";
    String MEETING_SHOW_AS_QUERY = "select INITCAP(show_as)from calendar_event order by id desc;";
    String MEETING_PRIVACY_QUERY = "select privacy from calendar_event order by id desc;";

}

/*
        SELECT name FROM maintenance_request limit 40;                  command to return just
        SELECT name FROM maintenance_request limit 5 OFFSET 10;         command to limit 5 beginning from 10
        SELECT *    FROM maintenance_request ORDER BY RANDOM() LIMIT 10;command to limit 10 random lines
        SELECT *    FROM calendar_event WHERE id ='132';                getting information from exact id
        SELECT *    FROM note_tag ORDER BY id ASC;                      ordering from the first ID
        SELECT *    FROM note_note ORDER BY id DESC;                    ordering from the last ID

        SELECT * from INFORMATION_SCHEMA.COLUMNS ;                      command to see all tables
        SELECT * from INFORMATION_SCHEMA.COLUMNS where table_name = 'employees';


 */
