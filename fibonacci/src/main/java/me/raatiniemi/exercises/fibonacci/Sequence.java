/*
 * Copyright (C) 2016 Tobias Raatiniemi
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.raatiniemi.exercises.fibonacci;

class Sequence {
    private final long lhs;
    private final long rhs;

    private Sequence(long lhs, long rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    static Sequence build(long lhs, long rhs) {
        return new Sequence(lhs, rhs);
    }

    long calculateValue() {
        return this.lhs + this.rhs;
    }

    Sequence calculateNextSequence() {
        return Sequence.build(this.rhs, this.calculateValue());
    }

    @Override
    public String toString() {
        return String.valueOf(this.calculateValue());
    }
}
