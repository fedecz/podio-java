package com.podio.app;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

public enum ApplicationFieldType {

	/**
	 * Mandatory field type that most be present in all apps.
	 */
	TITLE,

	/**
	 * A short text field that can hold a limited text string
	 */
	SMALL_TEXT,

	/**
	 * A large text field that can hold a arbitrary long text.
	 */
	LARGE_TEXT,

	/**
	 * A field that can hold a single number with decimals.
	 */
	NUMBER,

	/**
	 * A field that can hold one or more state values.
	 */
	STATE,

	/**
	 * Holds an image. Can currently only be used internally by Hoist.
	 */
	IMAGE,

	/**
	 * An embedded media typically from youtube or similar.
	 */
	MEDIA,

	/**
	 * A interval presented by a start and optional end date and optional time
	 */
	DATE,

	/**
	 * A reference to another app item.
	 */
	APP,

	/**
	 * Reference a member in the same space as the app
	 */
	MEMBER,

	/**
	 * A currency value
	 */
	MONEY,

	/**
	 * The progress of an app item.
	 */
	PROGRESS,

	/**
	 * A location in f.ex. Google maps
	 */
	LOCATION,

	/**
	 * An uploaded video file. Can currently only be used by Hoist.
	 */
	VIDEO;

	@Override
	@JsonValue
	public String toString() {
		return name().toLowerCase();
	}

	@JsonCreator()
	public static ApplicationFieldType getByName(String value) {
		System.out.println(value);
		return ApplicationFieldType.valueOf(value.toUpperCase());
	}
}