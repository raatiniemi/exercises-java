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

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculateSequenceTest {
    @Test
    public void calculate() {
        CalculateSequence calculateSequence = new CalculateSequence(10);
        List<Sequence> sequences = calculateSequence.calculate();

        assertEquals(10, sequences.size());
    }
}
