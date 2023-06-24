package com.inventory.officeitems.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "office_data")
public class Product {
    @Id
    public Integer row_id;

    public String order_id;
    public String order_date;
    public String ship_date;

    public String ship_mode;

    public String customerid;

    public String customer_name;

    String segment;

    String country;

    String city;

    String state;

    Double postal_code;

    String region;

    String product_id;

    public String category;

    String sub_category;

    public String product_name;

    float sales;
    int quantity;

    float discount;

    float profit;

    public Product() {

    }

    public Product(Integer row_id, String order_id, String Order_Date, String Ship_Date, String Ship_Mode,
            String Customer_ID,
            String Customer_Name, String Segment, String Country, String city, String State, Double Postal_Code,
            String Region,
            String Product_ID, String category, String Sub_Category, String Product_Name, float Sales, int Quantity,
            float Discount, float Profit) {
        this.row_id = row_id;
        this.order_id = order_id;
        this.order_date = Order_Date;
        this.ship_date = Ship_Date;
        this.ship_mode = Ship_Mode;
        this.customerid = Customer_ID;
        this.customer_name = Customer_Name;
        this.segment = Segment;
        this.country = Country;
        this.city = city;
        this.state = State;
        this.postal_code = Postal_Code;
        this.region = Region;
        this.product_id = Product_ID;
        this.category = category;
        this.sub_category = Sub_Category;
        this.product_name = Product_Name;
        this.sales = Sales;
        this.quantity = Quantity;
        this.discount = Discount;
        this.profit = Profit;
    }

    // getters and setters

    public String getOrder_id() {
        return order_id;
    }

    public Integer getRow_id() {
        return row_id;
    }

    public void setRow_id(Integer row_id) {
        this.row_id = row_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_Date() {
        return order_date;
    }

    public void setOrder_Date(String order_Date) {
        order_date = order_Date;
    }

    public String getShip_Date() {
        return ship_date;
    }

    public void setShip_Date(String ship_Date) {
        ship_date = ship_Date;
    }

    public String getShip_mode() {
        return ship_mode;
    }

    public void setShip_mode(String ship_mode) {
        this.ship_mode = ship_mode;
    }

    public String getCustomer_id() {
        return customerid;
    }

    public void setCustomer_id(String customer_id) {
        this.customerid = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String Segment) {
        segment = Segment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String Country) {
        country = Country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String City) {
        city = City;
    }

    public String getState() {
        return state;
    }

    public void setState(String State) {
        state = State;
    }

    public Double getPostal_Code() {
        return postal_code;
    }

    public void setPostal_Code(Double postal_Code) {
        postal_code = postal_Code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String Region) {
        region = Region;
    }

    public String getProduct_ID() {
        return product_id;
    }

    public void setProduct_ID(String product_ID) {
        product_id = product_ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String Category) {
        category = Category;
    }

    public String getSub_Category() {
        return sub_category;
    }

    public void setSub_Category(String sub_Category) {
        sub_category = sub_Category;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_Name) {
        product_name = product_Name;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float Sales) {
        sales = Sales;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int Quantity) {
        quantity = Quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float Discount) {
        discount = Discount;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float Profit) {
        profit = Profit;
    }

    @Override
    public String toString() {
        return "Product [row_id=" + row_id + ", order_id=" + order_id + ", order_date=" + order_date + ", ship_date="
                + ship_date + ", ship_mode=" + ship_mode + ", customerid=" + customerid + ", customer_name="
                + customer_name + ", segment=" + segment + ", country=" + country + ", city=" + city + ", state="
                + state + ", postal_code=" + postal_code + ", region=" + region + ", product_id=" + product_id
                + ", category=" + category + ", sub_category=" + sub_category + ", product_name=" + product_name
                + ", sales=" + sales + ", quantity=" + quantity + ", discount=" + discount + ", profit=" + profit + "]";
    }
}
