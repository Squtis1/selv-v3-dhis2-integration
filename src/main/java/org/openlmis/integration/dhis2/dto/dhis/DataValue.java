/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2017 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms
 * of the GNU Affero General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details. You should have received a copy of
 * the GNU Affero General Public License along with this program. If not, see
 * http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org.
 */

package org.openlmis.integration.dhis2.dto.dhis;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Objects of this class represent data sent to the DHIS2 API.
 * Data Value is the single recorded value of Data Element. It is described by at least three
 * dimensions: data element, organisation unit and period.
 * @see <a href="https://docs.dhis2.org/">DHIS2 Documentation</a>
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DataValue {

  private String dataElement;
  private BigDecimal value;

}