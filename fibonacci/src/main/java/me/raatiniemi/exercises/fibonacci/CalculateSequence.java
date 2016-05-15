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

import java.util.ArrayList;
import java.util.List;

public class CalculateSequence {
    private final int sequenceCount;
    private List<Sequence> sequences = new ArrayList<>();

    CalculateSequence(int sequenceCount) {
        this.sequenceCount = sequenceCount;
    }

    public static void main(String... arguments) {
        if (null == arguments[0]) {
            System.out.print("No sequence count have been supplied");
            System.exit(1);
        }

        int sequenceCount = Integer.valueOf(arguments[0]);
        CalculateSequence calculateSequence = new CalculateSequence(sequenceCount);
        calculateSequence.calculate()
                .stream()
                .forEach(sequence -> System.out.println(sequence.calculateValue()));
    }

    List<Sequence> calculate() {
        Sequence sequence = Sequence.build(0, 1);

        for (int i = 0; i < this.sequenceCount; i++) {
            sequence = sequence.calculateNextSequence();

            sequences.add(sequence);
        }
        return sequences;
    }
}
