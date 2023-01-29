'use strict';
const NodePolyfillPlugin = require('node-polyfill-webpack-plugin');

const { merge } = require('webpack-merge');

const common = require('./webpack.common.js');
const PATHS = require('./paths');

// Merge webpack configuration files
const config = (env, argv) =>
  merge(common, {
    entry: {
      popup: PATHS.src + '/popup.js',
      contentScript: PATHS.src + '/contentScript.js',
      background: PATHS.src + '/background.js',
    },
    devtool: argv.mode === 'production' ? false : 'source-map',
    plugins: [new NodePolyfillPlugin()],
    resolve: {
      fallback: {
        fs: false,
      },
    },
  });

module.exports = config;
// module.exports.plugins = [new NodePolyfillPlugin()];
// module.exports = {
//   // Other rules...
//   plugins: [new NodePolyfillPlugin()],
// };
