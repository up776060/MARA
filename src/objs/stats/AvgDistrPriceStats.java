/*
#  Licensed to the Apache Software Foundation (ASF) under one
#  or more contributor license agreements.  See the NOTICE file
#  distributed with this work for additional information
#  regarding copyright ownership.  The ASF licenses this file
#  to you under the Apache License, Version 2.0 (the
#  "License"); you may not use this file except in compliance
#  with the License.  You may obtain a copy of the License at
#
#  http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing,
#  software distributed under the License is distributed on an
#  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
#  KIND, either express or implied.  See the License for the
#  specific language governing permissions and limitations
#  under the License.
*/

package objs.stats;

public class AvgDistrPriceStats
{

	private double min;
	private double max;
	private double avg;


	/**
	* Initialises variabe values to 0
	*/
	public AvgDistrPriceStats()
	{
		min = 0;
		max = 0;
		avg = 0;
	}

	/**
	* Assigns passed parameter values to variables
	* @param min - a value
	* @param max - a value
	* @param avg - a value
	*/
	public AvgDistrPriceStats(double min, double max, double avg)
	{
		this.min = min;
		this.max = max;
		this.avg = avg;
	}

	/**
	* Returns the minimum value
	* @return min - a value
	*/
	public double getMin() {
		return min;
	}

	/**
	* Sets the value of min  variable
	* @param min - a value
	*/
	public void setMin(double min) {
		this.min = min;
	}

	/**
	* Returns the maximum value
	* @return max - a value
	*/
	public double getMax() {
		return max;
	}

	/**
	* Sets the value of max variable
	* @param max - a value
	*/
	public void setMax(double max) {
		this.max = max;
	}

	/**
	* Returns the average value
	* @return avg - a value
	*/
	public double getAvg() {
		return avg;
	}

	/**
	* Sets the value of avg variable
	* @param avg - a value
	*/
	public void setAvg(double avg) {
		this.avg = avg;
	}



}
