/*
 * Copyright 2022-2024 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package im.vector.app.features.call.webrtc

/**
 * VoIP configuration for WebRTC calls.
 *
 * @param handleCallAssertedIdentityEvents Whether to handle call asserted identity events
 * @param forceRelayOnlyMode When true, forces all WebRTC traffic through TURN relay servers.
 *                          This disables direct P2P connections and STUN, ensuring all
 *                          audio/video streams are relayed through the TURN server.
 *                          Useful for: privacy requirements, strict firewall environments,
 *                          or cross-border communication stability.
 */
data class VoipConfig(
      val handleCallAssertedIdentityEvents: Boolean,
      val forceRelayOnlyMode: Boolean = true  // Default to true for full TURN support
)
