/*
 * Copyright (c) 2011, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package eel.kitchen.jsonschema.v2.keyword;

import org.codehaus.jackson.JsonNode;

import java.math.BigDecimal;

public final class MaximumKeywordValidator
    extends AbstractKeywordValidator
{
    private final BigDecimal maximum;
    private final boolean exclusiveMaximum;

    public MaximumKeywordValidator(final JsonNode schema)
    {
        super(schema);
        maximum = schema.get("maximum").getDecimalValue();
        exclusiveMaximum = schema.path("exclusiveMaximum").asBoolean(false);
    }

    @Override
    public ValidationStatus validate(final JsonNode instance)
    {
        final int cmp = maximum.compareTo(instance.getDecimalValue());

        if (cmp < 0) {
            messages.add("instance is greater than the required maximum");
            return ValidationStatus.FAILURE;
        }

        if (cmp == 0 && exclusiveMaximum) {
            messages.add("instance is not strictly lower than the required "
                + "maximum");
            return ValidationStatus.FAILURE;
        }

        return ValidationStatus.SUCCESS;
    }
}
