/*
 * Copyright (c) 2013, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.fge.jsonschema.messages;

/**
 * Messages used by keyword validation
 */
//TODO: reorganize
public enum KeywordValidationMessages
{
    ADDITIONAL_ITEMS_NOT_ALLOWED("additional items are not allowed"),
    ARRAY_IS_TOO_SHORT("array does not have enough elements"),
    ARRAY_IS_TOO_LONG("array has too many elements"),
    ELEMENTS_NOT_UNIQUE("array must not contain duplicate elements"),
    NUMBER_TOO_SMALL("number is lower than the required minimum"),
    NUMBER_EX_SMALL("number is not strictly greater than the required minimum"),
    NUMBER_TOO_LARGE("number is greater than the required maximum"),
    NUMBER_EX_LARGE("number is not strictly lower than the required maximum"),
    ADDITIONAL_PROPERTIES_NOT_ALLOWED("additional properties are not allowed"),
    STRING_TOO_SHORT("string is too short"),
    STRING_TOO_LONG("string is too long"),
    REGEX_NO_MATCH("regex does not match input string"),
    VALUE_NOT_IN_ENUM("instance does not match any enum value"),
    NON_ZERO_DIVISION_REMAINDER("remainder of division is not zero"),
    NOT_ENOUGH_MEMBERS_IN_OBJECT("object has too few properties"),
    TOO_MANY_MEMBERS_IN_OBJECT("object has too many properties"),
    MISSING_REQUIRED_MEMBERS("missing required property(ies)"),
    MISSING_PROPERTY_DEPS("missing property dependencies"),
    TYPE_NO_MATCH("instance type does not match any allowed primitive type"),
    ANYOF_FAIL("instance failed to match at least one schema"),
    ALLOF_FAIL("instance failed to match all schemas"),
    ONEOF_FAIL("instance failed to match exactly one schema"),
    NOT_FAIL("instance matches a schema which it should not"),
    DISALLOWED_TYPE("instance type is not allowed"),
    DISALLOW_SCHEMA("instance matches one or more disallowed schema(s)")
    ;

    private final String message;

    KeywordValidationMessages(final String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return message;
    }
}
