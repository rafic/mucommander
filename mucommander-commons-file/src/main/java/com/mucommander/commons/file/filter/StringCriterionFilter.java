/**
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2017 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.mucommander.commons.file.filter;

/**
 * @author Maxence Bernard
 */
public interface StringCriterionFilter extends CriterionFilter<String> {

    /**
     * Returns <code>true</code> if this <code>CriterionFilter</code> is case-sensitive.
     *
     * @return true if this <code>CriterionFilter</code> is case-sensitive.
     */
    boolean isCaseSensitive();

    /**
     * Specifies whether this <code>CriterionFilter</code> should be case-sensitive or not when comparing paths.
     *
     * @param caseSensitive if true, this CriterionFilter will be case-sensitive
     */
    void setCaseSensitive(boolean caseSensitive);
}
