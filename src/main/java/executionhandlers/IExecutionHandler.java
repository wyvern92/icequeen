﻿package executionhandlers;

import events.OrderEvent;

/// The ExecutionHandler abstract class handles the interaction
/// between a set of order objects generated by a Portfolio and
/// the ultimate set of Fill objects that actually occur in the
/// market.
/// 
/// The handlers can be used to subclass simulated brokerages
/// or live brokerages, with identical interfaces.This allows
/// strategies to be backtested in a very similar manner to the
/// live trading engine.
public interface IExecutionHandler {
	/// Takes an Order event and executes it, producing
	/// a Fill event that gets placed onto the Events queue.
	/// </summary>
	/// <param name="orderEvent">Contains an Event object with order
	/// information.</param>
	void ExecuteOrder(OrderEvent orderEvent);
}
