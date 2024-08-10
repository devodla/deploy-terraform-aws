package uk.layme.deployterraformaws.controller;

import java.time.Instant;

public record TimestampResponse(Instant requestDateTime) {
}
