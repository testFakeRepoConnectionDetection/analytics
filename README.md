# Analytics (fixture)

Business function: `MIDDLE_OFFICE` (`app.business_function`).
Pillar: `Trading & Analytics` (`app.pillar`).

Risk analytics.

## Integrations (topology)

- Sends the price to **Trading/Pricing** on `/api/v1/prices`.
- Receives the trade from **Trading/Pricing** on `/api/v1/trades`.
- Sends PV to **DataHub** on `/api/v1/realtime-pv`.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data | frequency |
|------|-----------|------|---------|------|-----------|
| Trading/Pricing | outbound | API | /api/v1/prices | `price` | `real-time` |
| Trading/Pricing | inbound | API | /api/v1/trades | `trade` | `real-time` |
| DataHub | outbound | API | /api/v1/realtime-pv | `PV` | `real-time` |

See `TransitDataTypes.java` and `application.yml` (`data`, `frequency`).
