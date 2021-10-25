package JCHW7;

public final class ApplicationGlobalState {
    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "nPGK5KwAlPjxGjIjWf1OIqo62sqEUgcW";
    private final String DB_FILENAME = "weather.db";
    private DatabaseRepositorySQLiteImpl myDB = null;

    private ApplicationGlobalState() {
    }

    // Непотокобезопасный код для упрощения
    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }
        return INSTANCE;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }

    public String getDBFilename() {
        return this.DB_FILENAME;
    }

    public DatabaseRepositorySQLiteImpl getDB() { return this.myDB; }

    public void setDB(DatabaseRepositorySQLiteImpl myDB) { this.myDB = myDB; }
}
