# tinyurl
A simple tinyurl implementation based on SpringBoot starter.

Author: Kenny He (he.scu2013@gmail.com)

## Currently it supports the following features:
  - A standalone web server.
  - Support HTTP POST to create a tiny URL for a long URL.
  - Support HTTP GET to access the tiny URL, and redirect to the long URL.

## Features to be added:
  - Save the tiny URLs into DB. (currently they are stored in a Hash table in the memory)
  - Support web UI to create tiny URL.
  - Add rate limiter for the tiny URL creation. (do not allow user create too many tiny URLs from a single client IP to avoid attack)
  - Distributed system. Multiple server support + consistent hash + load balancer

Project start date: 6/27/2016, just for fun.
