# System Java

System Java chart for DevOps CI/CD

## Base container image
eclipse-temurin

## Core parameters
| Name | Description | Value |
| --- | --- | --- |
| `service.type` | Kubernetes Service type | `ClusterIP` |
| `service.externalPort` | HTTP port to expose at service level | `80` |
| `service.internalPort` | HTTP port to expose at container level | `80` |
| `ingress.enabled` | Enable ingress controller resource | `false` |
