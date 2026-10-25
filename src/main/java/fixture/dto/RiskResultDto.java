package fixture.dto;

/**
 * Risk result sent back to Trading/Pricing.
 * flow data_category: RISK_RESULT
 */
public record RiskResultDto(String tradeId, String book, String delta, String pv) {}
