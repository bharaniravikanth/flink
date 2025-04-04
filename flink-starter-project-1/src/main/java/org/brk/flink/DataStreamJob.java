package org.brk.flink;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class DataStreamJob {

	public static void main(String[] args) throws Exception {
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		DataStream<String> stringStreamData=env.fromElements("hello","world","how are you");
		stringStreamData.print();
		env.execute("Flink Java API Skeleton");
	}
}
