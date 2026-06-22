package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    @Column(nullable=false)
    private int quantity;
    

    protected Security() {
    }

    public Security(
            Portfolio portfolio,
            String name,
            String category,
            BigDecimal purchasePrice,
            LocalDateTime purchaseDate,
            int quantity
    ) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchasedate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return portfolioId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String gettName() {
        return name;
    }

    public void setFirstName(String Name) {
        this.name = Name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String Category) {
        this.category = Category;
    }

    public BigDecimal getPurchasePrice(){
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal PurchasePrice) {
        this.purchasePrice = PurchasPrice;
    }

    public LocalDateTime getPurchaseDate() {
    return purchaseDate;}

    public void setPurchaseDate(LocalDateTime purchaseDate) {
    this.purchaseDate = purchaseDate;
    }

    public int getQuantity(){
        return purchasePrice;
    }

    public void setQuantity(int Quantity) {
        this.quantity = Quantity;
    }

    
}