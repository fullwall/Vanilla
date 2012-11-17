/*
 * This file is part of Vanilla.
 *
 * Copyright (c) 2011-2012, VanillaDev <http://www.spout.org/>
 * Vanilla is licensed under the SpoutDev License Version 1.
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.vanilla.protocol.rcon.msg;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.spout.api.util.SpoutToStringStyle;
import org.spout.vanilla.protocol.msg.VanillaMessage;

/**
 * Base class for messages passed through the rcon protocol
 */
public class RconMessage extends VanillaMessage {
	private final String payload;

	public RconMessage(String payload) {
		this.payload = payload;
	}

	public String getPayload() {
		return payload;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, SpoutToStringStyle.INSTANCE)
				.append("payload", payload)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(849, 385)
				.append(payload)
				.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RconMessage) {
			final RconMessage other = (RconMessage) obj;
			return new EqualsBuilder()
					.append(payload, other.payload)
					.isEquals();
		} else {
			return false;
		}
	}
}
