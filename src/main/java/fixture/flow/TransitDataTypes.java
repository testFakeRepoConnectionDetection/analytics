package fixture.flow;

/**
 * Edge attributes on Analytics flows.
 * grep: data frequency price trade PV real-time
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Analytics. */
  public static final String BUSINESS_FUNCTION = "MIDDLE_OFFICE";

  /** Node attribute pillar for Analytics. */
  public static final String PILLAR = "Trading & Analytics";

  public static final String DATA_PRICE = "price";
  public static final String DATA_TRADE = "trade";
  public static final String DATA_PV = "PV";
  public static final String FREQUENCY_REAL_TIME = "real-time";

  private TransitDataTypes() {}
}
