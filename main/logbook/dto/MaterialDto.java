package logbook.dto;

import java.util.Date;

/**
 * 保有資材を表します
 *
 */
public final class MaterialDto extends AbstractDto implements Cloneable {

    /** 日付 */
    private Date time = new Date();

    /** 直前のイベント */
    private String event;

    /** 燃料 */
    private int fuel;

    /** 弾薬 */
    private int ammo;

    /** 鋼材 */
    private int metal;

    /** ボーキサイト */
    private int bauxite;

    /** バーナー */
    private int burner;

    /** 高速修復材 */
    private int bucket;

    /** 開発資材 */
    private int research;

    /** ねじ */
    private int screw;

    @Override
    public MaterialDto clone() {
        try {
            return (MaterialDto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }

    public MaterialDto consumed(ResourceItemDto res) {
        this.time = new Date();
        this.fuel -= res.getFuel();
        this.ammo -= res.getAmmo();
        this.metal -= res.getMetal();
        this.bauxite -= res.getBauxite();
        this.burner -= res.getBurners();
        this.bucket -= res.getBuckets();
        this.research -= res.getResearch();
        this.screw -= res.getScrew();
        return this;
    }

    public MaterialDto obtained(ResourceItemDto res) {
        this.time = new Date();
        this.fuel += res.getFuel();
        this.ammo += res.getAmmo();
        this.metal += res.getMetal();
        this.bauxite += res.getBauxite();
        this.burner += res.getBurners();
        this.bucket += res.getBuckets();
        this.research += res.getResearch();
        this.screw += res.getScrew();
        return this;
    }

    /**
     * 日付を取得します。
     * @return 日付
     */
    public Date getTime() {
        return this.time;
    }

    /**
     * 日付を設定します。
     * @param time 日付
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 日付を取得します。
     * @return 日付
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * 日付を設定します。
     * @param time 日付
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * 燃料を取得します。
     * @return 燃料
     */
    public int getFuel() {
        return this.fuel;
    }

    /**
     * 燃料を設定します。
     * @param fuel 燃料
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     * 弾薬を取得します。
     * @return 弾薬
     */
    public int getAmmo() {
        return this.ammo;
    }

    /**
     * 弾薬を設定します。
     * @param ammo 弾薬
     */
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    /**
     * 鋼材を取得します。
     * @return 鋼材
     */
    public int getMetal() {
        return this.metal;
    }

    /**
     * 鋼材を設定します。
     * @param metal 鋼材
     */
    public void setMetal(int metal) {
        this.metal = metal;
    }

    /**
     * ボーキサイトを取得します。
     * @return ボーキサイト
     */
    public int getBauxite() {
        return this.bauxite;
    }

    /**
     * ボーキサイトを設定します。
     * @param bauxite ボーキサイト
     */
    public void setBauxite(int bauxite) {
        this.bauxite = bauxite;
    }

    /**
     * バーナーを取得します。
     * @return バーナー
     */
    public int getBurner() {
        return this.burner;
    }

    /**
     * バーナーを設定します。
     * @param burner バーナー
     */
    public void setBurner(int burner) {
        this.burner = burner;
    }

    /**
     * 高速修復材を取得します。
     * @return 高速修復材
     */
    public int getBucket() {
        return this.bucket;
    }

    /**
     * 高速修復材を設定します。
     * @param bucket 高速修復材
     */
    public void setBucket(int bucket) {
        this.bucket = bucket;
    }

    /**
     * 開発資材を取得します。
     * @return 開発資材
     */
    public int getResearch() {
        return this.research;
    }

    /**
     * 開発資材を設定します。
     * @param research 開発資材
     */
    public void setResearch(int research) {
        this.research = research;
    }

    /**
     * @return screw
     */
    public int getScrew() {
        return this.screw;
    }

    /**
     * @param screw セットする screw
     */
    public void setScrew(int screw) {
        this.screw = screw;
    }

}
