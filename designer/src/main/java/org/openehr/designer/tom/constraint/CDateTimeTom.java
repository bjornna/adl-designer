/*
 * ADL2-core
 * Copyright (c) 2013-2014 Marand d.o.o. (www.marand.com)
 *
 * This file is part of ADL2-core.
 *
 * ADL2-core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.openehr.designer.tom.constraint;

import org.openehr.jaxb.rm.IntervalOfDateTime;

/**
 * @author Marko Pipan
 */
public class CDateTimeTom extends ConstraintTom {
    private String pattern;
    private IntervalOfDateTime range;

    private CDateTimeTom original;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public IntervalOfDateTime getRange() {
        return range;
    }

    public void setRange(IntervalOfDateTime range) {
        this.range = range;
    }

    public CDateTimeTom getOriginal() {
        return original;
    }

    public void setOriginal(CDateTimeTom original) {
        this.original = original;
    }
}
