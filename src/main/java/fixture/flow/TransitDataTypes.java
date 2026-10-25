package fixture.flow;

/**
 * Data categories on Analytics flows.
 * grep: data_category RISK_MARKET_DATA POSITION_SNAPSHOT
 */
public final class TransitDataTypes {

  public static final String HTTP_RISK_MARKET_DATA = "RISK_MARKET_DATA";
  public static final String KAFKA_POSITION_SNAPSHOT = "POSITION_SNAPSHOT";

  public static final String HTTP_PAYLOAD_FORMAT = "JSON";
  public static final String KAFKA_PAYLOAD_FORMAT = "AVRO";

  private TransitDataTypes() {}
}
