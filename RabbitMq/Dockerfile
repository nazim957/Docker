# Use the official RabbitMQ image as a base
FROM rabbitmq:3.8

# Expose the ports used by RabbitMQ
EXPOSE 5672 15672

# Define environment variables for RabbitMQ
ENV RABBITMQ_DEFAULT_USER=guest \
    RABBITMQ_DEFAULT_PASS=guest

# Define a health check to ensure RabbitMQ is ready to use
HEALTHCHECK --interval=30s --timeout=5s --start-period=30s --retries=3 \
  CMD rabbitmqctl wait /var/lib/rabbitmq/mnesia/rabbit@$HOSTNAME.pid || exit 1
