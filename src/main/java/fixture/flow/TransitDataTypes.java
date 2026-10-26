package fixture.flow;

/**
 * Data categories on Analytics flows.
 * grep: data_category PRICED_TRADE RISK_RESULT POSITION_SNAPSHOT RISK_MARKET_DATA
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Analytics. */
  public static final String BUSINESS_FUNCTION = "MIDDLE_OFFICE";

  /** Node attribute pillar for Analytics. */
  public static final String PILLAR = "Trading & Analytics";

  public static final String API_PRICED_TRADE = "PRICED_TRADE";
  public static final String HTTP_RISK_RESULT = "RISK_RESULT";
  public static final String KAFKA_POSITION_SNAPSHOT = "POSITION_SNAPSHOT";
  public static final String HTTP_RISK_MARKET_DATA = "RISK_MARKET_DATA";

  public static final String HTTP_PAYLOAD_FORMAT = "JSON";
  public static final String KAFKA_PAYLOAD_FORMAT = "AVRO";

  private TransitDataTypes() {}
}
