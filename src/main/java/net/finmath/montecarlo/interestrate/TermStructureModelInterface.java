/*
 * (c) Copyright Christian P. Fries, Germany. All rights reserved. Contact: email@christianfries.com.
 *
 * Created on 04.02.2016
 */

package net.finmath.montecarlo.interestrate;

import java.util.Map;

import net.finmath.exception.CalculationException;
import net.finmath.stochastic.RandomVariableInterface;

/**
 * @author Christian Fries
 *
 */
public interface TermStructureModelInterface extends SingleCurrencyInterestRateModelInterface {

	public RandomVariableInterface getLIBOR(double time, double periodStart, double periodEnd);

	/**
	 * Create a new object implementing TermStructureModelInterface, using the new data.
	 * 
	 * @param dataModified A map with values to be used in constructions (keys are identical to parameter names of the constructors).
	 * @return A new object implementing TermStructureModelInterface, using the new data.
	 * @throws net.finmath.exception.CalculationException Thrown if the valuation fails, specific cause may be available via the <code>cause()</code> method.
	 */
	@Override
	TermStructureModelInterface getCloneWithModifiedData(Map<String, Object> dataModified) throws CalculationException;
}