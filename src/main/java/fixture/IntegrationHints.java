package fixture;

import org.springframework.kafka.annotation.KafkaListener;

/**
 * Risk analytics. Pulls market data from DataHub and consumes Booking positions.
 *
 * <p>data_category: RISK_MARKET_DATA (HTTP outbound), POSITION_SNAPSHOT (Kafka inbound).
 */
public class IntegrationHints {

  // HTTP POST datahub /api/v1/risk-market-data — data_category RISK_MARKET_DATA
  //   (fixture.dto.RiskMarketDataRequestDto)

  /** data_category POSITION_SNAPSHOT — produced by Booking */
  @KafkaListener(topics = "positions.snapshot", groupId = "analytics-risk")
  public void onPositionSnapshot(String payload) {}
}
