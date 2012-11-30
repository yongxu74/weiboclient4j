package weiboclient4j.params;

/**
 * @author Hover Ruan
 */
public enum PoiSortType implements ParameterAction {
    Time(0), Hot(1),;

    private int value;

    PoiSortType(int value) {
        this.value = value;
    }

    public void addParameter(Parameters params) {
        if (this != Time) {
            params.add("sort", value);
        }
    }
}
