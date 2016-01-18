# amazon-kinesis-agent-extension
Extension interfaces for Amazon Kinesis Agent https://github.com/awslabs/amazon-kinesis-agent

## Usage
Extensions JAR libraries should be put into **/usr/share/aws-kinesis-agent/lib** directory.

Example configuration file:

    {
      "checkpointFile": "/tmp/aws-kinesis-agent-checkpoints",
      "cloudwatch.emitMetrics": true,
      "cloudwatch.endpoint": "https://monitoring.us-west-2.amazonaws.com",
      "kinesis.endpoint": "https://kinesis.us-west-2.amazonaws.com",
      "awsAccessKeyId": "ACCESSKEY",
      "awsSecretAccessKey": "SECRETKEY",
      "flows": [
      {
        "filePattern": "/tmp/aws-kinesis-agent-test1.log*",
        "kinesisStream": "aws-kinesis-agent-test1",
        "converterClass": "com.amazon.kinesis.streaming.agent.extension.AgentConverterExample"
      },
      {
        "filePattern": "/tmp/aws-kinesis-agent-test2.log*",
        "kinesisStream": "aws-kinesis-agent-test2"
      }
      ]
    }

Configuration file location: **/etc/aws-kinesis/agent.json**
