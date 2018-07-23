package br.com.strn.ec.database.entities.client;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "linkblockshop")
public class LinkBlockShop implements Serializable {

	private String id;
    private LinkBlock linkBlock;
    private Shop shop;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_link_block")
    public LinkBlock getLinkBlock() {
        return linkBlock;
    }

    public void setLinkBlock(LinkBlock linkBlock) {
        this.linkBlock = linkBlock;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_shop")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}