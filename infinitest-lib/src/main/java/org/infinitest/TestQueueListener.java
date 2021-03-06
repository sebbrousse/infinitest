/*
 * This file is part of Infinitest.
 *
 * Copyright (C) 2010
 * "Ben Rady" <benrady@gmail.com>,
 * "Rod Coffin" <rfciii@gmail.com>,
 * "Ryan Breidenbach" <ryan.breidenbach@gmail.com>, et al.
 *
 * Infinitest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Infinitest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Infinitest.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.infinitest;

// DEBT Should split this listener
public interface TestQueueListener extends ReloadListener {
	/**
	 * Called when the contents of the test queue changes. When the size of the
	 * queue reaches zero, the test run is complete.
	 */
	void testQueueUpdated(TestQueueEvent event);

	/**
	 * Called when all the work generated by an update is complete. This is
	 * called <b>after</b> the last test queue event is fired (where the size of
	 * the queue is zero). This will be called even if no tests were actually
	 * queued and run.
	 */
	void testRunComplete();

}
