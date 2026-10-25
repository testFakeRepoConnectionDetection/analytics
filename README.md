# Analytics (fixture)

Risk analytics. Bidirectional with Trading/Pricing, fed by Booking positions, and a client of DataHub.

## Integrations (topology)

- Exposes `/api/v1/priced-trades` called by **Trading/Pricing**.
- Sends the risk result back to **Trading/Pricing** on `/api/v1/risk-results`.
- Consumes Kafka topic `positions.snapshot` produced by **Booking**.
- Calls **DataHub** over HTTP for risk market data (`/api/v1/risk-market-data`).

## Data transiting on flows (Data Model fixture)

| Peer | Kind | direction | Channel | data_category |
|------|------|-----------|---------|---------------|
| Trading/Pricing | API | inbound | /priced-trades | `PRICED_TRADE` |
| Trading/Pricing | API | outbound | /risk-results | `RISK_RESULT` |
| Booking | KAFKA | inbound | positions.snapshot | `POSITION_SNAPSHOT` |
| DataHub | API | outbound | /risk-market-data | `RISK_MARKET_DATA` |

Constants: `fixture.flow.TransitDataTypes`. DTOs: `RiskResultDto`, `RiskMarketDataRequestDto`.
