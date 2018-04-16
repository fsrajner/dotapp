public class Player {

    @SerializedName("account_id")
    @Expose
    private Integer account_id;

    @SerializedName("personaname")
    @Expose
    private String personaname;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("steamid")
    @Expose
    private String steamid;

    @SerializedName("avatar")
    @Expose
    private Avatar avatar;

    @SerializedName("loccountrycode")
    @Expose
    private String loccountrycode;

    public Integer getAccountId() {
        return account_id;
    }
    public String getPersonName() {
        return personaname;
    }
    public String getName() {
        return name;
    }
    public String getSteamId() {
        return steamid;
    }
    public Avatar getAvatar() {
        return avatar;
    }
    public String getLocCountryCode() {
        return loccountrycode;
    }
}
